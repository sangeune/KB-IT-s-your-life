<template>
  <div>
    <h2>관심있는 K-POP 가수?</h2>
    <hr />
    <ul>
      <!-- <CheckboxItem v-for="idol in idols" :key="idol.id" v-bind="idol" /> -->
      <CheckboxItem
        v-for="idol in idols"
        :key="idol.id"
        :name="idol.name"
        :checked="idol.checked"
      />
    </ul>
  </div>
  <!-- <h2>App 컴포넌트</h2>
  <hr />
  <ul>
    <CheckboxItem />
    <CheckboxItem />
    <CheckboxItem />
    <CheckboxItem />
  </ul> -->
</template>
<script>
import CheckboxItem from './components/CheckboxItem.vue';
export default {
  name: 'App',
  components: { CheckboxItem },
  data() {
    return {
      idols: [
        { id: 1, name: 'BTS', checked: true },
        { id: 2, name: 'Black Pink' },
        { id: 3, name: 'EXO' },
        { id: 4, name: { spacial: 'ITZY' } },
        // { id: 4, name: 'ITZY' },
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
