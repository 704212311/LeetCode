package structure.queueAndStack.example;

import java.util.ArrayList;
import java.util.List;

class MyCircularQueue {

	// 队列容器
	private List<Integer> list;
	// 队列长度
	private int length;
	// 队列头部指针
	private int q_start;
	// 队列尾部指针
	private int q_end;

	// 构造器，设置队列长度为 k
	public MyCircularQueue(int k) {
		this.list = new ArrayList<Integer>(k);
		this.length = k;
		this.q_start = 0;
		this.q_end = 0;
	}

	// 向循环队列插入一个元素。如果成功插入则返回真
	public boolean enQueue(int value) {
		return false;
	}

	// 从循环队列中删除一个元素。如果成功删除则返回真
	public boolean deQueue() {
		return false;
	}

	// 从队首获取元素。如果队列为空，返回 -1
	public int Front() {
		return 0;
	}

	// 获取队尾元素。如果队列为空，返回 -1
	public int Rear() {
		return 0;
	}

	// 检查循环队列是否为空
	public boolean isEmpty() {
		// 队列首尾相等则为空
		if (q_start == q_end) {
			return true;
		}
		return false;
	}

	// 检查循环队列是否已满
	public boolean isFull() {
		// 根据首尾顺序分情况判断
		if (q_end > q_start) {
			// 尾>首，相差为length-1则为满
			if (q_end - q_start >= length - 1) {
				return true;
			}
		} else {
			// 尾<=首，相差为1则为满
			if (q_start - q_end == 1) {
				return true;
			}
		}
		return false;
	}
}
