package celestial;

import java.util.Comparator;

class rrkE implements Comparator<rrdD> {
   public int id_class(rrdD var1, rrdD var2) {
      return var1.id_class().compareToIgnoreCase(var2.id_class());
   }
}
