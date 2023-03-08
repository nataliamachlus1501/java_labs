package threads_pt2;
///replaces all the vowels with empty spaces " " and then displays the updated content in the console
public class NoVowelsThread extends Thread{
    Text text;

    NoVowelsThread(Text t){
        this.text = t;
    }

    @Override
    public void run() {
        synchronized (text){
            try{
                while(!text.slTIsOver){
                    text.wait();
                }
            }
            catch (InterruptedException e) {
                System.out.println(this.getName() + " is interrupted");
            }
            String updated;
            updated = text.content.replace("a", " ");
            text.content = updated;
            updated = text.content.replace("o", " ");
            text.content = updated;
            updated = text.content.replace("u", " ");
            text.content = updated;
            updated = text.content.replace("i", " ");
            text.content = updated;
            updated = text.content.replace("e", " ");
            text.content = updated;
            updated = text.content.replace("y", " ");
            text.content = updated;

            System.out.println("NoVowels: " + text.content);
        }
    }
        //char ch[]=Text.content.toCharArray();
        ///for(int i = 0; i < ch.length; i++){
            //if (ch[i]=='a'||ch[i] == 'ą'||ch[i]=='e'||ch[i]=='ę'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='y') {
                //ch[i]= '\u00A0';
            //}
        //}
        //for (int i = 0; i < ch.length; i++) {
            //System.out.print(ch[i]);
        //}

    }

