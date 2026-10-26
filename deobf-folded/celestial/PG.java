package celestial;

import com.google.gson.annotations.SerializedName;

public class PG {
   @SerializedName("x")
   public int id_class;
   @SerializedName("z")
   public int id_break;

   @Override
   public String toString() {
      return this.id_class + ", " + this.id_break;
   }
}
