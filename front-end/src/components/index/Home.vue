<template >
  <div class="qwer" >

    <NavigationBarIndex/>

    <!--Добавление карусели с помощью компонента carousel-->
    <Carousel id="Carousel"/>

    <!--Footer-->
    <Footer/>

  </div>
</template>

<!--Scripts-->

<script>

  import Carousel from './Carousel'
  import Modal from '../registration/Modal.vue'
  import NavigationBarIndex from './NavigationBarIndex'
  import Footer from './Footer'

  export default {
    components: {
      Carousel,
      Modal,
      NavigationBarIndex,
      Footer
    }
  }

</script>
