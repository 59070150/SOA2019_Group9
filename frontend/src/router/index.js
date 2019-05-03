import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Navigation from '@/components/Navigation'
import LoginPage from '@/pages/Login'
import ShowtimePage from '@/pages/ShowtimePage'
import RegisterPage from '@/pages/Register'

Vue.use(Router)

export default new Router({
  routes: [
    // {
    //   path: '/',
    //   name: 'Navigation',
    //   component: Navigation
    // },
    // {
    //   path: '/',
    //   name: 'Login',
    //   component: LoginPage
    // },
    {
      path: '/',
      name: 'Login',
      component: LoginPage
    },
    {
      path: '/showtime',
      name: 'ShowtimePage',
      component: ShowtimePage
    },
    {
      name: 'Register',
      component: RegisterPage
    },
  ]
})
