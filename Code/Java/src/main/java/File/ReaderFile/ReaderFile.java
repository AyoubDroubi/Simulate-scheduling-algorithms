package File.ReaderFile;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import statically.Queue.Queue;
import statically.Process;

/**
 *
 * @author Ayyoub
 */
public class ReaderFile {

    Queue queue = new Queue();
    String LinkFile ;
    public ReaderFile(Queue Queue , String LinkFile) {
        this.queue = Queue;
        this.LinkFile = LinkFile;
    }

    public Queue generateQueue() {
        
        try {

            BufferedReader br = new BufferedReader(new FileReader(LinkFile));

           
            int count = Integer.parseInt(br.readLine());
            StringTokenizer tok;
            Process pro;
            for (int i = 0; i < count; i++) {
                tok = new StringTokenizer(br.readLine());
                pro = new Process(Integer.parseInt(tok.nextToken()), Integer.parseInt(tok.nextToken()));
                queue.enque(pro);
            }
        } catch (Exception ex) {
            System.out.println("the file is not found ");
            System.exit(0);

        }
        
        return queue;
    }

}
