//Thanakorn Pasangthien Section 1 6088109
import java.util.ArrayList;
import java.util.Iterator;
public class Playlist {
	private String name;
	private double totalduration;
	private ArrayList<Song> list = new ArrayList<Song>();
	public Playlist(String name) {
		this.name = name;
		this.totalduration = 0;
	}
	public void addSong(Song a) {
		list.add(a);
		totalduration += a.getDurationInSec();
	}
	public void addSongAtIndex(Song a,int index) {
		 try {
			 	list.add(index,a);
				totalduration += a.getDurationInSec();
	        } catch (IndexOutOfBoundsException error) {
	          System.out.println("Error: Couldn't add song at index "+index);
	       } 
	}
	public void removeSongByIndex(int index) {
		 try {
			 	totalduration -= list.get(index).getDurationInSec();
				list.remove(index);
	        } catch (IndexOutOfBoundsException error) {
	        	System.out.println("Error: index is invalid");
	       }
	}
	public void removeSongByTitle(String title) {
		int k = 1;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).geTitle().equals(title)) {
				totalduration -= list.get(i).getDurationInSec();
				list.remove(list.get(i));
				k=0;
				break;
			}
		}
		if(k==1) {
			System.out.println("Error: Title is not found");
		}
	}
	public void moveUp(int position) {
		Song temp = list.get(position-1);
		Song goal = list.get(position);
		list.remove(list.get(position-1));
		list.add(position-1,goal);
		list.remove(list.get(position));
		list.add(position,temp);
	}
	public void moveDown(int position) {
		Song temp = list.get(position+1);
		Song goal = list.get(position);
		list.remove(list.get(position+1));
		list.add(position+1,goal);
		list.remove(list.get(position));
		list.add(position,temp);
	}
	public void showPlaylist() {
		System.out.println(this.name);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("["+i+"]"+list.get(i).toString());
		}
		int min = (int)this.totalduration/60;
		double sec = (this.totalduration-(60*min))/100;
		double out = min+sec;
		System.out.printf("Total duration:"+out+"minutes");
	}
	
}
