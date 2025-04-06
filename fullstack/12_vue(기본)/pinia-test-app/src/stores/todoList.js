import { defineStore } from "pinia";
import { computed, reactive } from "vue";

export const useTodoListStore = defineStore("todoList", () => {
  // 반응형 상태
  const state = reactive({
    todoList: [
      { id: 1, todo: "ES6학습", done: false },
      { id: 2, todo: "React학습", done: false },
      { id: 3, todo: "ContextAPI 학습", done: true },
      { id: 4, todo: "야구경기 관람", done: false },
    ],
  });

  // action
  const addTodo = (todo) => {
    state.todoList.push({ id: new Date().getTime(), todo, done: false });
  };
  const deleteTodo = (id) => {
    let index = state.todoList.findIndex((todo) => todo.id === id);
    state.todoList.splice(index, 1);
  };
  const toggleDone = (id) => {
    let index = state.todoList.findIndex((todo) => todo.id === id);
    state.todoList[index].done = !state.todoList[index].done;
  };

  // 계산된 속성
  const doneCount = computed(() => {
    return state.todoList.filter((todoItem) => todoItem.done === true).length;
  });
  const todoList = computed(() => state.todoList);
  return { todoList, doneCount, addTodo, deleteTodo, toggleDone };
});
