package celestial;

public class iq_3 {
   public static final iq_3 class_ = class_("core");
   public static final iq_3 break_ = class_("idle");
   public static final iq_3 byte_ = class_("work");
   public static final iq_3 protected_ = class_("play");
   public static final iq_3 throws_ = class_("rest");
   public static final iq_3 case_ = class_("meet");
   public static final iq_3 catch_ = class_("panic");
   public static final iq_3 private_ = class_("raid");
   public static final iq_3 implements_ = class_("pre_raid");
   public static final iq_3 finally_ = class_("hide");
   public static final iq_3 extends_ = class_("fight");
   public static final iq_3 native_ = class_("celebrate");
   public static final iq_3 volatile_ = class_("admire_item");
   public static final iq_3 final_ = class_("avoid");
   public static final iq_3 package_ = class_("ride");
   private final String int_;
   private final int new_;

   private iq_3(String var1) {
      this.int_ = var1;
      this.new_ = var1.hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         iq_3 var2 = (iq_3)var1;
         return this.int_.equals(var2.int_);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.class_();
   }

   @Override
   public int hashCode() {
      return this.new_;
   }

   public String class_() {
      return this.int_;
   }

   private static iq_3 class_(String var0) {
      return rVL.class_(rVL.z, var0, new iq_3(var0));
   }
}
