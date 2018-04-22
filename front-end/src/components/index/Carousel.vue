<template>
  <div class="qwer">
    <b-carousel id="carousel1"
                style="text-shadow: 1px 1px 2px #333;"
                controls
                indicators
                background="#ababab"
                :interval="3000"
                img-width="1024"
                img-height="480"
                v-model="slide"
                @sliding-start="onSlideStart"
                @sliding-end="onSlideEnd"
    >

      <!-- Text slides with image -->
      <!--img-src="https://lorempixel.com/1024/480/technics/2/"-->
      <b-carousel-slide caption="First slide"
                        img-blank img-alt="Blank image"
                        class="slide1"
                        text="Nulla vitae elit libero, a pharetra augue mollis interdum."
      >

      </b-carousel-slide>

      <!-- Slides with custom text -->
      <b-carousel-slide caption="Blank Image" img-blank img-alt="Blank image" class="slide2">

      </b-carousel-slide>

      <!-- Slides with image only -->
      <b-carousel-slide caption="Blank Image" img-blank img-alt="Blank image" class="slide3">
      </b-carousel-slide>

      <!-- Slides with img slot -->
      <!-- Note the classes .d-block and .img-fluid to prevent browser default image alignment -->
      <b-carousel-slide caption="Blank Image" img-blank img-alt="Blank image" class="slide4">

      </b-carousel-slide>

      <!-- Slide with blank fluid image to maintain slide aspect ratio -->
      <b-carousel-slide caption="Blank Image" img-blank img-alt="Blank image" class="slide5">
        <p>
          Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse
          eros felis, tincidunt a tincidunt eget, convallis vel est. Ut pellentesque
          ut lacus vel interdum.
        </p>
      </b-carousel-slide>

    </b-carousel>

    <!--<p class="mt-4">-->
      <!--Slide #: {{ slide }}<br>-->
      <!--Sliding: {{ sliding }}-->
    <!--</p>-->

  </div>
</template>

<script>
  export default {
    data () {
      return {
        slide: 0,
        sliding: null
      }
    },
    methods: {
      onSlideStart (slide) {
        this.sliding = true
      },
      onSlideEnd (slide) {
        this.sliding = false
      }
    }
  }
</script>
<!-- carousel-1.vue -->

<style lang="css">
  .slide1 {
    background-image: url("../../assets/11_0.jpg");
    background-size: cover;
  }
  .slide2 {
    background-image: url("../../assets/resni.jpg");
    background-size: cover;
  }
  .slide3 {
    background-image: url("../../assets/manik.jpg");
    background-size: cover;
  }
  .slide4 {
    background-image: url("../../assets/beard.jpg");
    background-size: cover;
  }
  .slide5 {
    background-image: url("../../assets/wom_hair.jpg");
    background-size: cover;
  }
</style>
