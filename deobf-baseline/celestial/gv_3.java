package celestial;

public class gv_3 implements rrGS {
   private final boolean id_class;
   private final rRu_1 id_break;
   private final boolean id_byte;
   private int id_protected;
   private int id_throws;
   private int id_case;
   private float id_catch;
   private long id_private;
   private long id_implements;
   private boolean id_finally;
   private rRO id_extends;
   private boolean id_native;

   @Override
   public void id_byte(int var1) {
      this.id_case = var1;
   }

   @Override
   public int id_byte() {
      return this.id_case;
   }

   public gv_3(rRO var1, boolean var2, boolean var3) {
      this.id_extends = var1;
      this.id_class = var2;
      this.id_byte = var3;
      this.id_break = new rRu_1();
   }

   @Override
   public void id_class(boolean var1) {
      this.id_finally = var1;
   }

   @Override
   public void id_class(float var1) {
      this.id_catch = var1;
   }

   public void id_class(long var1) {
      this.id_private = var1;
   }

   @Override
   public void id_class(rfH_2 var1, float var2) {
      this.id_protected = var1.b_();
      this.id_throws = var1.c_();
      this.id_case = var1.d_();
      this.id_catch = var2;
   }

   public void id_class(rRO var1) {
      rrxr_3.a.id_catch(var1, this.id_extends);
      this.id_extends = var1;
   }

   @Override
   public void id_class(Ko_1 var1) {
      rrGS.super.id_class(var1);
   }

   @Override
   public int id_class() {
      return this.id_protected;
   }

   @Override
   public void id_class(int var1) {
      this.id_protected = var1;
   }

   @Override
   public int id_break() {
      return this.id_throws;
   }

   @Override
   public void id_break(int var1) {
      this.id_throws = var1;
   }

   public void id_break(boolean var1) {
      this.id_native = var1;
   }

   public void id_break(long var1) {
      this.id_implements = var1;
   }

   @Override
   public long id_throws() {
      return this.id_private;
   }

   @Override
   public rRu_1 id_finally() {
      return this.id_break;
   }

   @Override
   public boolean id_catch() {
      return false;
   }

   @Override
   public rRO id_extends() {
      return this.id_extends;
   }

   @Override
   public long id_case() {
      return this.id_implements;
   }

   @Override
   public boolean id_implements() {
      return this.id_class;
   }

   @Override
   public float id_protected() {
      return this.id_catch;
   }

   @Override
   public boolean id_private() {
      return this.id_finally;
   }

   public double id_final() {
      return this.id_byte ? 1.0 : 0.03125;
   }

   public double id_volatile() {
      return this.id_byte ? 0.0 : 63.0;
   }

   @Override
   public boolean id_native() {
      return this.id_native;
   }
}
