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
public class daftarFilm {
    String filmName, filmGenre;
    Double filmRating;
    int filmDuration;
    
    public void nowPlaying(){

        System.out.println("");
        System.out.println("Judul Film : " +filmName);
        System.out.println("Genre Film : " +filmGenre);
        System.out.println("Rating Film : " +filmRating);
        System.out.println("Duration Film : " +filmDuration +" Menit");
    
    }
}
