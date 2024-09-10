package nested.nested1.ex2;



public class Network {

    public void sendMessage(String text){
        // 내부에서 내부클래스를 호출할땐 Outerclass.nestedclass 이 방식을 안 지켜도 된다
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
    private static class NetworkMessage { // private 씀으로써 내부에서만 쓴다는 표시를 나타낸다
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }
        public void print(){
            System.out.println(content);
        }
    }

}
