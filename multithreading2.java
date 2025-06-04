class FileDownload{
    public static void download(String file){
        for(int i=1;i<=5;i++){
            System.out.println(file + " downloading..." + (i*20) + "%");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
               
            }
        }
        System.out.println(file + " downloaded ");
    }
}
public class multithreading2 {
    public static void main(String[] args) {
        FileDownload obj = new FileDownload();
        obj.download("file A");
        obj.download("file B");
    }
}
