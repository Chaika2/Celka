package celestial;

import com.google.gson.annotations.SerializedName;

public class PG {
   @SerializedName("x")
   public int class_;
   @SerializedName("z")
   public int break_;

   @Override
   public String toString() {
      return this.class_ + ", " + this.break_;
   }
}
