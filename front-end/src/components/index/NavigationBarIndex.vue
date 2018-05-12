<template>
  <div class="qwer">
    <b-navbar toggleable="md" type="dark" variant="dark" fixed="top">

      <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

      <b-navbar-brand id="brand" href="#">Human Care</b-navbar-brand>

      <b-collapse is-nav id="nav_collapse">

        <b-navbar-nav>
          <button type="button" class="btn btn-outline-warning">О нас</button>

          <!--<b-nav-item href="#" disabled>Disabled</b-nav-item>-->
          <b-nav-item style="margin-left: 10px;">Личный кабинет</b-nav-item>
          <b-nav-item style="margin-left: 10px;">Разместить услугу</b-nav-item>
          <b-nav-item style="margin-left: 10px;">Подобрать мастера</b-nav-item>
        </b-navbar-nav>

        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto">
          <!--<b-btn variant="warning" class="btn btn-warning btn-lg-nav-reg">Регистрация</b-btn>-->
          <!--Registration with modal-->
          <Modal/>
          <!--End registration-->
          <modal-registration></modal-registration>
          <button type="button" class="btn btn-warning btn-lg-nav-enter">Вход</button>

        </b-navbar-nav>

      </b-collapse>
    </b-navbar>
  </div>
</template>

<script>

  import Modal from '../registration/Modal'

  export default {
    components: {
      Modal
    }
  }
</script>

<style lang="css">

  #brand{
    color: #ffc107;
    font-size: 180%;
    font-weight: 400;
  }

  /*  Enter button style  */
  .btn-lg-nav-enter, .btn-group-lg > .btn {
    margin-left: 5mm;
    width: 100px;
    height: 38px;
    background-color: #2f302f;
    /*border-color: #007bff;*/
  }

  /*  Registration button style  */
  .btn-lg-nav-reg, .btn-group-lg > .btn {
    margin-left: 5mm;
    width: 70%;
    height: 10%;
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
