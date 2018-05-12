<template>
  <div>
    <b-form @submit="onSubmit" @reset="onReset" v-if="show" id="registration">
      <b-form-group id="EmailAdress"
                    label="Email адрес:"
                    label-for="EmailAdress">
        <!--description="We'll never share your email with anyone else."-->
        <b-form-input id="EmailAdress"
                      type="email"
                      v-model="form.email"
                      required
                      placeholder="Введите email">
        </b-form-input>
      </b-form-group>
      <b-form-group id="PhoneNumber"
                    label="Номер телефона:"
                    label-for="PhoneNumber">
        <b-form-input id="PhoneNumber"
                      type="text"
                      v-model="form.phoneNumber"
                      required
                      placeholder="Введите номер телефона">
        </b-form-input>
      </b-form-group>
      <b-form-group id="Password"
                    label="Пароль:"
                    label-for="Password">
        <b-form-input id="Password"
                      type="password"
                      v-model="form.password"
                      required
                      placeholder="Введите пароль">
        </b-form-input>
      </b-form-group>
      <b-form-group id="NameInput"
                    label="Имя:"
                    label-for="NameInput">
        <b-form-input id="NameInput"
                      type="text"
                      v-model="form.name"
                      required
                      placeholder="Введите имя">
        </b-form-input>
      </b-form-group>
      <b-form-group id="SerName"
                    label="Фамилия:"
                    label-for="SerName">
        <b-form-input id="SerName"
                      type="text"
                      v-model="form.surname"
                      placeholder="Введите фамилию">
        </b-form-input>
      </b-form-group>
      <!--<b-form-group id="exampleInputGroup3"-->
                    <!--label="Food:"-->
                    <!--label-for="exampleInput3">-->
        <!--<b-form-select id="exampleInput3"-->
                       <!--:options="foods"-->
                       <!--required-->
                       <!--v-model="form.food">-->
        <!--</b-form-select>-->
      <!--</b-form-group>-->
      <!--<b-form-group id="exampleGroup4">-->
        <!--<b-form-checkbox-group v-model="form.checked" id="exampleChecks">-->
          <!--<b-form-checkbox value="me">Check me out</b-form-checkbox>-->
          <!--<b-form-checkbox value="that">Check that out</b-form-checkbox>-->
        <!--</b-form-checkbox-group>-->
      <!--</b-form-group>-->
      <b-button type="submit" variant="primary">Submit</b-button>
      <b-button type="reset" variant="danger">Reset</b-button>
    </b-form>
  </div>
</template>

<script>
  import axios from 'axios'
  export default {
    data () {
      return {
        form: {
          name: '',
          surname: '',
          email: '',
          phoneNumber: '',
          password: ''
          // food: null,
          // checked: []
        },
        // foods: [
        //   { text: 'Select One', value: null },
        //   'Carrots', 'Beans', 'Tomatoes', 'Corn'
        // ],
        show: true
      }
    },
    methods: {
      onSubmit (evt) {
        evt.preventDefault();
        axios.post("localhost:8080/account/save", {body: this.form})
          .then(response => {
            if (response.status === 200) {
              console.log(response);
            }
          }).catch(function (error) {
          alert("Error...");
          console.log(error);
        });
         alert(JSON.stringify(this.form));
      },
      onReset (evt) {
        evt.preventDefault();
        /* Reset our form values */
        this.form.email = '';
        this.form.name = '';
        this.form.food = null;
        this.form.checked = [];
        /* Trick to reset/clear native browser form validation state */
        this.show = false;
        this.$nextTick(() => { this.show = true });
      }
    }
  }
</script>
