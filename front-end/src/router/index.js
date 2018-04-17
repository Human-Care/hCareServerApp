import Vue from 'vue'
import Router from 'vue-router'
import NavBar from '@/components/index/NavBar'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'index',
      component: NavBar
    }
  ]
})
