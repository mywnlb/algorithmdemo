package com.example.lb.algorithmdemo.stucture;

/**
 * describe:队列
 *
 * @author lb
 * @date 2019/07/15
 */
public class ArrayQueue {

    class CircleArry{
        private int maxsize;
        //rear 变量的含义做一个调整：rear 指向队列的最后一个元素的后一个位置. 因为希望空出一个空间做为约定.
        private int rear;
        //front 变量的含义做一个调整： front 就指向队列的第一个元素, 也就是说 arr[front] 就是队列的第一个元素
        private int front;
        private int[] arr;

        public CircleArry(int maxsize){
            maxsize = maxsize;
            arr = new int[maxsize];
        }

        public boolean isFull(){
            return (rear+1)%maxsize == front;
        }

        public boolean isEmpty(){
            return rear == front;
        }

        public void addQueue(int n){
            if(isFull()){
                System.out.println("满了");
                return;
            }

            arr[rear] = n;
            rear = (rear+1)%maxsize;
        }

        public int getQueue(){
            if(isEmpty()){
                System.out.println("空的");
                return -1;
            }

            int value = arr[front];
            front = (front + 1) % maxsize;
            return value;
        }

        public void showQueue(){
            if(isEmpty()){
                System.out.println("空的");
                return;
            }

            for (int i = front; i <front+size() ; i++) {
                System.out.printf("arr[%d]值是%d",i%maxsize,arr[i%maxsize]);
            }
        }
        public int size(){
            return (rear+maxsize-front)%maxsize;
        }
    }
}
