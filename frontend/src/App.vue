<template>
  <div id="app">
    <navigation/>
    <router-view/>
  </div>
</template>

<script>
import Navigation from '@/components/Navigation'
export default {
  name: 'App',
  components: {Navigation},
}
</script>

<style>
@font-face {
  font-family: 'Anakotmai';
  src: url('assets/fonts/anakotmai-medium.woff') format('woff');
  font-weight: medium;
}

@font-face {
  font-family: 'Anakotmai';
  src: url('assets/fonts/anakotmai-bold.woff') format('woff');
  font-weight: bold;
}

@font-face {
  font-family: 'Anakotmai';
  src: url('assets/fonts/anakotmai-light.woff') format('woff');
  font-weight: lighter;
}
#app {
  margin-top: 80px;
  font-family: Anakotmai;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  margin-bottom: 5rem;
}
.align-left {
  text-align: left;
}

.align-center {
  text-align: center;
}

.align-right {
  text-align: right;
}

.mt-3{
  margin-top: 3rem;
}
</style>
