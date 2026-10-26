package celestial;

import java.util.Properties;
import org.apache.commons.lang3.ArrayUtils;

public class rrdw_1 {
   private int id_class = 0;
   private String id_break = null;
   private String[] id_byte = null;
   private String id_protected = null;
   private String[] id_throws = null;
   private int id_case = 0;

   public String id_byte() {
      return this.id_byte[this.id_case];
   }

   public rrdw_1(String var1, String[] var2, String var3, String[] var4, int var5) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_class = var5;
      if (var2.length != var4.length) {
         throw new IllegalArgumentException("Property and user values have different lengths: " + var2.length + " != " + var4.length);
      } else if (var5 >= 0 && var5 < var2.length) {
         this.id_case = var5;
      } else {
         throw new IllegalArgumentException("Invalid default value: " + var5);
      }
   }

   @Override
   public String toString() {
      return this.id_break + "=" + this.id_byte() + " [" + rrbb_3.id_class(this.id_byte) + "], value: " + this.id_case;
   }

   public boolean id_class(String var1) {
      if (var1 == null) {
         this.id_case = this.id_class;
         return false;
      } else {
         this.id_case = ArrayUtils.indexOf(this.id_byte, var1);
         if (this.id_case >= 0 && this.id_case < this.id_byte.length) {
            return true;
         } else {
            this.id_case = this.id_class;
            return false;
         }
      }
   }

   public void id_class(boolean var1) {
      byte var2 = 0;
      int var3 = this.id_byte.length - 1;
      this.id_case = rrbb_3.id_class(this.id_case, var2, var3);
      if (var1) {
         this.id_case++;
         if (this.id_case > var3) {
            this.id_case = var2;
         }
      } else {
         this.id_case--;
         if (this.id_case < var2) {
            this.id_case = var3;
         }
      }
   }

   public boolean id_class(Properties var1) {
      this.id_case();
      if (var1 == null) {
         return false;
      } else {
         String var2 = var1.getProperty(this.id_break);
         return var2 == null ? false : this.id_class(var2);
      }
   }

   public void id_class(int var1) {
      this.id_case = var1;
      if (this.id_case < 0 || this.id_case >= this.id_byte.length) {
         this.id_case = this.id_class;
      }
   }

   public int id_class() {
      return this.id_case;
   }

   public void id_break(Properties var1) {
      if (var1 != null) {
         var1.setProperty(this.id_throws(), this.id_byte());
      }
   }

   public String id_break() {
      return this.id_throws[this.id_case];
   }

   public String id_throws() {
      return this.id_break;
   }

   public void id_case() {
      this.id_case = this.id_class;
   }

   public String id_protected() {
      return this.id_protected;
   }
}
