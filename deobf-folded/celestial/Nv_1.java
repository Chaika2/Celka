package celestial;

public abstract class Nv_1 implements NQ {
   protected Nq_1 id_break;
   protected final rqL_2 id_byte;
   protected final rqO_2 id_protected;
   protected float id_throws = 1.0F;
   protected float id_case = 1.0F;
   protected double id_catch;
   protected double id_private;
   protected double id_implements;
   protected boolean id_finally;
   protected int id_extends;
   protected NN id_native = NN.LINEAR;
   protected boolean id_volatile;
   protected boolean id_final;

   @Override
   public double id_int() {
      return this.id_implements;
   }

   protected Nv_1(rqA_2 var1, rqL_2 var2) {
      this(var1.id_class(), var2);
   }

   protected Nv_1(rqO_2 var1, rqL_2 var2) {
      this.id_protected = var1;
      this.id_byte = var2;
   }

   @Override
   public String toString() {
      return "SoundInstance[" + this.id_protected + "]";
   }

   @Override
   public NI id_class(Nf_1 var1) {
      NI var2 = var1.id_class(this.id_protected);
      if (var2 == null) {
         this.id_break = Nf_1.id_class;
      } else {
         this.id_break = var2.id_byte();
      }

      return var2;
   }

   @Override
   public boolean id_finally() {
      return this.id_final;
   }

   @Override
   public Nq_1 id_catch() {
      return this.id_break;
   }

   @Override
   public int id_extends() {
      return this.id_extends;
   }

   @Override
   public rqO_2 id_case() {
      return this.id_protected;
   }

   @Override
   public boolean id_implements() {
      return this.id_finally;
   }

   @Override
   public NN id_new() {
      return this.id_native;
   }

   @Override
   public double id_package() {
      return this.id_private;
   }

   @Override
   public rqL_2 id_private() {
      return this.id_byte;
   }

   @Override
   public double id_final() {
      return this.id_catch;
   }

   @Override
   public float id_volatile() {
      return this.id_case * this.id_break.id_case();
   }

   @Override
   public float id_native() {
      return this.id_throws * this.id_break.id_throws();
   }
}
