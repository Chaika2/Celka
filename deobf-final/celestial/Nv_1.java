package celestial;

public abstract class Nv_1 implements NQ {
   protected Nq_1 break_;
   protected final rqL_2 byte_;
   protected final rqO_2 protected_;
   protected float throws_ = 1.0F;
   protected float case_ = 1.0F;
   protected double catch_;
   protected double private_;
   protected double implements_;
   protected boolean finally_;
   protected int extends_;
   protected NN native_ = NN.LINEAR;
   protected boolean volatile_;
   protected boolean final_;

   @Override
   public double int_() {
      return this.implements_;
   }

   protected Nv_1(rqA_2 var1, rqL_2 var2) {
      this(var1.class_(), var2);
   }

   protected Nv_1(rqO_2 var1, rqL_2 var2) {
      this.protected_ = var1;
      this.byte_ = var2;
   }

   @Override
   public String toString() {
      return "SoundInstance[" + this.protected_ + "]";
   }

   @Override
   public NI class_(Nf_1 var1) {
      NI var2 = var1.class_(this.protected_);
      if (var2 == null) {
         this.break_ = Nf_1.class_;
      } else {
         this.break_ = var2.byte_();
      }

      return var2;
   }

   @Override
   public boolean finally_() {
      return this.final_;
   }

   @Override
   public Nq_1 catch_() {
      return this.break_;
   }

   @Override
   public int extends_() {
      return this.extends_;
   }

   @Override
   public rqO_2 case_() {
      return this.protected_;
   }

   @Override
   public boolean implements_() {
      return this.finally_;
   }

   @Override
   public NN new_() {
      return this.native_;
   }

   @Override
   public double package_() {
      return this.private_;
   }

   @Override
   public rqL_2 private_() {
      return this.byte_;
   }

   @Override
   public double final_() {
      return this.catch_;
   }

   @Override
   public float volatile_() {
      return this.case_ * this.break_.case_();
   }

   @Override
   public float native_() {
      return this.throws_ * this.break_.throws_();
   }
}
