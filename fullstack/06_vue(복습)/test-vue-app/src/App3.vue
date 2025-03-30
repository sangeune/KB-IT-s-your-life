<template>
  <div>
    <h2>관심있는 K-POP 가수?</h2>
    <hr />
    <ul>
      <CheckboxItem v-for="idol in idols" :idol="idol" />
    </ul>
  </div>
</template>
<script>
import CheckboxItem from './components/CheckboxItem3.vue';
import Idol from './Idol';
export default {
  name: 'App3',
  components: { CheckboxItem },
  data() {
    return {
      idols: [
        new Idol(1, 'BTS', true),
        new Idol(2, 'Black Pink', false),
        new Idol(3, 'EXO', false),
        new Idol(4, 'ITZY', false),

        // { id: 1, name: 'BTS', checked: true },
        // { id: 2, name: 'Black Pink', checked: false },
        // { id: 3, name: 'EXO', checked: false },
        // { id: 4, name: 'ITZY', checked: false },
      ],
    };
  },
};

// export default {
//   name: 'App',
//   components: { CheckboxItem },
// };
</script>
