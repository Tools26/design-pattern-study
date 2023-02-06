public class Main {
    public static void main(String args[]) {
        Download download = new Proxy_DownloadFile("CS.pdf");
        Download download2 = new Proxy_DownloadFile("test.txt");

        download.downloadFile();
        download2.downloadFile();
    }
}
