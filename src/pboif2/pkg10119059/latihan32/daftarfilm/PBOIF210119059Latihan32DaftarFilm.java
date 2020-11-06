/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan daftar film
 */
package pboif2.pkg10119059.latihan32.daftarfilm;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan32DaftarFilm {

    public static void main(String[] args) {
    
        daftarFilm film = new daftarFilm ();
        
        System.out.println("=== Daftar Film Sedang Tayang ===");
        
        film.filmName = "Venom";
        film.filmGenre = "Action, Horror, Scifi";
        film.filmRating = 8.5;
        film.filmDuration = 120;
        film.nowPlaying();
        
        film.filmName = "Small Foot";
        film.filmGenre = "Animation";
        film.filmRating = 9.0;
        film.filmDuration = 96;
        film.nowPlaying();
        
        film.filmName = "Crazy Rich Asian";
        film.filmGenre = "Comedy";
        film.filmRating = 7.8;
        film.filmDuration = 119;
        film.nowPlaying();
        
        film.filmName = "Asih";
        film.filmGenre = "Horror";
        film.filmRating = 6.0;
        film.filmDuration = 100;
        film.nowPlaying();
    }
    
}
