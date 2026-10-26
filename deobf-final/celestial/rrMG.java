package celestial;

import java.util.UUID;

public class rrMG implements rrbD_2 {
   private an_3 class_;

   @Override
   public rYG byte_() {
      return this.class_.BQ().class_;
   }

   public void class_(an_3 var1) {
      this.class_ = var1;
   }

   @Override
   public int class_() {
      UUID var1 = this.class_.ro();
      long var2 = var1.getLeastSignificantBits();
      return (int)(var2 & 2147483647L);
   }

   @Override
   public rfH_2 break_() {
      return this.class_.BQ().break_;
   }

   @Override
   public int throws_() {
      return !(this.class_ instanceof iB_2 var1) ? 0 : (int)var1.Ss();
   }

   public an_3 catch_() {
      return this.class_;
   }

   @Override
   public int case_() {
      return !(this.class_ instanceof iB_2 var1) ? 0 : (int)var1.SK();
   }

   @Override
   public String protected_() {
      return this.class_.Bk() ? this.class_.rD().getString() : null;
   }
}
