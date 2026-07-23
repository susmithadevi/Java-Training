package Day29;
import java.util.*;

public class CourseSchedul {



    static class Solution {

        public boolean canFinish(int numCourses, int[][] prerequisites) {

            int[] indegree = new int[numCourses];
            List<List<Integer>> graph = new ArrayList<>();

            for (int i = 0; i < numCourses; i++)
                graph.add(new ArrayList<>());

            for (int[] p : prerequisites) {
                graph.get(p[1]).add(p[0]);
                indegree[p[0]]++;
            }

            Queue<Integer> queue = new LinkedList<>();

            for (int i = 0; i < numCourses; i++)
                if (indegree[i] == 0)
                    queue.offer(i);

            int count = 0;

            while (!queue.isEmpty()) {

                int node = queue.poll();
                count++;

                for (int next : graph.get(node)) {

                    indegree[next]--;

                    if (indegree[next] == 0)
                        queue.offer(next);
                }
            }

            return count == numCourses;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[][] pre = {{1,0}};

        System.out.println(obj.canFinish(2, pre));
    }
}
    

