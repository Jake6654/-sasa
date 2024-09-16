package nested.test2;

public class Library {
    int size;
    int bookCount;
    Book[] books;

    public Library(int size) {
        this.size = size;
        books = new Book[size];
    }

    public void addBook(String title, String author) {
        // 검증로직 다 처리하고 (영한 썜 처리 선호 처리 방식)
        if (bookCount >= size) {
            System.out.println("도서관 저장 공간이 부족합니다");
            return;
        }
        // 정상 로직을 처리
        books[bookCount++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 == ");
        for (Book book : books) {
            System.out.println("도서 제목: "+ book.title + " 저자: " + book.author);
        }
    }

    private static class Book{ // 정적 중첩 클래스는 바깥 클래스와 전혀 다른 클래스이다. 따라서 바깥 클래스의 인스턴트에 소속되지 않는다
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
