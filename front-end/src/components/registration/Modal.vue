<template>
  <div>
    <b-btn variant="warning" class="btn btn-warning btn-lg-nav-reg" @click="show=true">Регистрация</b-btn>
    <b-modal centered v-model="show"
             title="Modal Variants"
             :header-bg-variant="headerBgVariant"
             :header-text-variant="headerTextVariant"
             :body-bg-variant="bodyBgVariant"
             :body-text-variant="bodyTextVariant"
             :footer-bg-variant="footerBgVariant"
             :footer-text-variant="footerTextVariant">
      <b-container fluid>
        <b-row class="mb-1 text-center">
          <b-col cols="3"> </b-col>
          <b-col>Background</b-col>
          <b-col>Text</b-col>
        </b-row>
        <b-row class="mb-1">
          <b-col cols="3">Header</b-col>
          <b-col><b-form-select :options="variants" v-model="headerBgVariant" /></b-col>
          <b-col><b-form-select :options="variants" v-model="headerTextVariant" /></b-col>
        </b-row>
        <b-row class="mb-1">
          <b-col cols="3">Body</b-col>
          <b-col><b-form-select :options="variants" v-model="bodyBgVariant" /></b-col>
          <b-col><b-form-select :options="variants" v-model="bodyTextVariant" /></b-col>
        </b-row>
        <b-row>
          <b-col cols="3">Footer</b-col>
          <b-col><b-form-select :options="variants" v-model="footerBgVariant" /></b-col>
          <b-col><b-form-select :options="variants" v-model="footerTextVariant" /></b-col>
        </b-row>
      </b-container>
      <div slot="modal-footer" class="w-100">
        <p class="float-left">Modal Footer Content</p>
        <b-btn size="sm" class="float-right" variant="primary" @click="show=false">
          Close
        </b-btn>
      </div>
    </b-modal>
  </div>
</template>

<script>
  export default {
    data () {
      return {
        show: false,
        variants: [
          'primary', 'secondary', 'success', 'warning', 'danger', 'info', 'light', 'dark'
        ],
        headerBgVariant: 'dark',
        headerTextVariant: 'light',
        bodyBgVariant: 'light',
        bodyTextVariant: 'dark',
        footerBgVariant: 'warning',
        footerTextVariant: 'dark'
      }
    }
  }
</script>


<!--<style scoped>-->
  <!--.btn-lg-nav-reg, .btn-group-lg > .btn {-->
    <!--margin-left: 5mm;-->
    <!--/*width: 70%;*/-->
    <!--/*height: 10%;*/-->
    <!--width: 41mm;-->
    <!--height: 10mm;-->
    <!--background-color: #2f302f;-->
    <!--/*border-color: #ff5247;*/-->
  <!--}-->

  <!--.btn-lg-nav-reg{-->
    <!--color: #ffffff;-->
  <!--}-->
<!--</style>-->

<style lang="css">

  /*  Registration button style  */
  .btn-lg-nav-reg, .btn-group-lg > .btn {
    margin-left: 5mm;
    width: 150px;
    height: 38px;
    background-color: #2f302f;
    /*border-color: #ff5247;*/
  }

  .btn-lg-nav-reg{
    color: #ffffff;
  }

  .btn-lg-nav-enter{
    color: #ffffff;
  }
</style>
