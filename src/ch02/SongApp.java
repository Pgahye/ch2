package ch02;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Song song=new Song();
		song.setAlbum("Real");
		song.setArtist("아이유");

		song.setComposer("이민수");
		song.setTitle("좋은날");
		song.setTrack(3);
		song.setYear(2010);
		
		song.show();		
		
	}

}
