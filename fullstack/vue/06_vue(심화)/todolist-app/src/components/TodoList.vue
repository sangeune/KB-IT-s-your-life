<template>
  <div class="row">
    <div class="col">
      <ul class="list-group">
        <!-- v-for 사용 -->
        <!-- 자식에게 받은 이벤트 부모에게 emit -->
        <TodoListItem
          v-for="todoItem in todoList"
          :key="todoItem.id"
          :todoItem="todoItem"
          @delete-todo="$emit('delete-todo', $event)"
          @toggle-completed="$emit('toggle-completed', $event)"
        />
      </ul>
    </div>
  </div>
</template>

<script>
import TodoListItem from "./TodoListItem.vue";

export default {
  name: "TodoList",
  components: { TodoListItem },
  props: {
    todoList: { type: Array, required: true },
  },
  emits: ["delete-todo", "toggle-completed"],
};
</script>
