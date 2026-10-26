package celestial;

import java.util.ArrayList;

public abstract class rrMi_1 {
   private rrWQ<aI_2, ryW_2> class_;
   private String break_;
   private float byte_;
   private String[] protected_;

   public String[] byte_() {
      return this.protected_;
   }

   public rrMi_1(ryW_2 var1, String var2, float var3, String[] var4) {
      this(rrWQ.break_(var1), var2, var3, var4);
   }

   public rrMi_1(rrWQ<aI_2, ryW_2> var1, String var2, float var3, String[] var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   public rrMi_1(aI_2 var1, String var2, float var3) {
      this(rrWQ.class_(var1), var2, var3, (String[])null);
   }

   public rrMi_1(ryW_2 var1, String var2, float var3) {
      this(rrWQ.break_(var1), var2, var3, (String[])null);
   }

   public rrMi_1(aI_2 var1, String var2, float var3, String[] var4) {
      this(rrWQ.class_(var1), var2, var3, var4);
   }

   public Iq_1[] class_(In_1 var1) {
      String[] var2 = this.case_();
      ArrayList var3 = new ArrayList();

      for (int var4 = 0; var4 < var2.length; var4++) {
         String var5 = var2[var4];
         Iq_1 var6 = this.class_(var1, var5);
         if (var6 != null) {
            var3.add(var6);
         }
      }

      return var3.toArray(new Iq_1[var3.size()]);
   }

   public abstract Iq_1 class_(In_1 var1, String var2);

   public abstract rrMa_1 class_(In_1 var1, float var2);

   public rrWQ<aI_2, ryW_2> class_() {
      return this.class_;
   }

   public String break_() {
      return this.break_;
   }

   public abstract In_1 throws_();

   public abstract String[] case_();

   public float protected_() {
      return this.byte_;
   }
}
