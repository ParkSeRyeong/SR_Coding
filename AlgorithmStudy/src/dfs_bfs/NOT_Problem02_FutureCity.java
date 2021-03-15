package dfs_bfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class NOT_Problem02_FutureCity {
	static boolean[] visited;
	static Stack<Integer> stack = new Stack<>();
	static StringBuilder sb=new StringBuilder();

	public static void dfs(ArrayList<Integer>[] list, int n) {
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ArrayList<Integer>[] list = new ArrayList[N + 1];
		visited = new boolean[N + 1];

		for (int i = 0; i < N+1; i++) {
			list[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		st = new StringTokenizer(br.readLine());
		int Destination = Integer.parseInt(st.nextToken());
		int Meeting = Integer.parseInt(st.nextToken());

		visited[1] = true;
		stack.push(1);
		System.out.print("1 ->");
		dfs(list,1);
	}
}
