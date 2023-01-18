import java.util.ArrayList;

public class ProductionCompany_TheirMoviesCount {
    static void MovieCount(ArrayList<Movie> movie)
    {
        ArrayList<Movie> ProductionCompanyMovie=new ArrayList<>();
        int[] counter = new int[movie.size()];
        ArrayList<Integer> Mcount = new ArrayList<>();
        for(int i=0; i<movie.size(); i++)
        {
            counter[i] = 1;
            ProductionCompanyMovie.add(movie.get(i));
        }
        //int size=movie.size();
       // System.out.println(x);
        int i=1;
       // int count=0;
        /*for(int j=0;j<x;++j)
        {
            String Str=ProductionCompanyMovie.get(j).ProductionCompany;
            int count=0;
            for(int p=0;p<x;++p)
            {
                String str2=ProductionCompanyMovie.get(p).ProductionCompany;
                if(str2.equalsIgnoreCase(Str))
                {
                    count++;
                    ProductionCompanyMovie.remove(p);
                    x--;

                }


            }
            System.out.println(i+")"+"Name of the production company :"+Str);
            System.out.println("     Total Movie Count : "+ count);
            System.out.println("\n");
            i++;

        }
*/

      for(int t=0;t<movie.size();++t)
      {
          String Str=movie.get(t).ProductionCompany;
          for(int j=t+1;j< movie.size();++j)
          {

              String str2=movie.get(j).ProductionCompany;
              if(str2.equalsIgnoreCase(Str))
              {
                  counter[t]=counter[t]+1;
                  counter[j] = -movie.size()-50;

              }
          }
      }
      for(int k =0; k<movie.size(); k++){
          if(counter[k]>=0){
              System.out.println(i+")"+"Name of the production company :"+movie.get(k).ProductionCompany);
              System.out.println("     Total Movie Count : "+ counter[k]);
              i++;
          }
      }






    }
}
