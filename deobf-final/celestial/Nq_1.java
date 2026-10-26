package celestial;

public class Nq_1 implements Nc_1<Nq_1> {
   private final rqO_2 class_;
   private final float break_;
   private final float byte_;
   private final int protected_;
   private final NT throws_;
   private final boolean case_;
   private final boolean catch_;
   private final int private_;

   public rqO_2 byte_() {
      return this.class_;
   }

   public Nq_1(String var1, float var2, float var3, int var4, NT var5, boolean var6, boolean var7, int var8) {
      this.class_ = new rqO_2(var1);
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
      this.private_ = var8;
   }

   @Override
   public String toString() {
      return "Sound{name="
         + this.class_
         + ", volume="
         + this.break_
         + ", pitch="
         + this.byte_
         + ", weight="
         + this.protected_
         + ", type="
         + this.throws_
         + ", streaming="
         + this.case_
         + ", preload="
         + this.catch_
         + ", attenuationDistance="
         + this.private_
         + "}";
   }

   @Override
   public void class_(Nt_1 var1) {
      if (this.catch_) {
         var1.class_(this);
      }
   }

   @Override
   public int class_() {
      return this.protected_;
   }

   public float throws_() {
      return this.break_;
   }

   public boolean finally_() {
      return this.catch_;
   }

   public Nq_1 catch_() {
      return this;
   }

   public int extends_() {
      return this.private_;
   }

   public float case_() {
      return this.byte_;
   }

   public boolean implements_() {
      return this.case_;
   }

   public rqO_2 protected_() {
      return new rqO_2(this.class_.byte_(), "sounds/" + this.class_.break_() + ".ogg");
   }

   public NT private_() {
      return this.throws_;
   }

   public rqO_2 native_() {
      return this.class_;
   }
}
