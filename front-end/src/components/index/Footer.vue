<template>
  <div>
  <a name="about"> </a>
      <b-jumbotron bg-variant="danger" text-variant="white" border-variant="dark">
        <template slot="header">
          Наша цель!
        </template>
        <template slot="lead">
          Предоставить людям простые и понятные инструменты для оказания и использовагия услуг!
        </template>
        <hr class="my-4">
        <p>
          А вы знали? <br> <br>Идея митапов возникла задолго до того, как появился Интернет.
          Однако само слово в известном нам значении стало употребляться с 2001 года!
        </p>
      </b-jumbotron>
      <b-jumbotron bg-variant="outline-danger" header="Делай что-нибудь!" id="jumbotron2">
        <p>Это значит, что нельзя сидеть на месте и ждать, пока другой реализует интересную идею,
          родившуюся у тебя в голове. <br> Какой бы сумасбродной ни была мысль – делись ею, ищи единомышленников,
          думайте как реализовать ее, встречайтесь, организовывайте.
          <br>Самое главное – это понять, что ты не одинок и в любом случае найдутся люди, готовые тебя поддержать.</p>
        <router-link :to="{ path: 'registration' }">
          <b-btn variant="danger" size="lg">Регистрируйся прямо сейчас!</b-btn>
        </router-link>
      </b-jumbotron>
      <footerone/>
  </div>
</template>
