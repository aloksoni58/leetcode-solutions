class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        LinkedList<String> list = new LinkedList<>();
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals("") || str[i].equals(".")) {
                continue;
            }
            else if(str[i].equals("..")) {
                if(!list.isEmpty()) {
                    list.removeFirst();
                }
            } else {
                list.addFirst(str[i]);
            }
        }
        Collections.reverse(list);
        path = "";
        while(!list.isEmpty()) {
            if(list.size() > 0) {
                path += "/";
            }
            path += list.getFirst();
            list.removeFirst();
        }
        return path.length() == 0 ? "/" : path;
    }
}