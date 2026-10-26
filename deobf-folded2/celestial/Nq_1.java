package celestial;

public class Nq_1 implements Nc_1<Nq_1> {
   private final rqO_2 id_class;
   private final float id_break;
   private final float id_byte;
   private final int id_protected;
   private final NT id_throws;
   private final boolean id_case;
   private final boolean id_catch;
   private final int id_private;

   public rqO_2 id_byte() {
      return this.id_class;
   }

   public Nq_1(String var1, float var2, float var3, int var4, NT var5, boolean var6, boolean var7, int var8) {
      this.id_class = new rqO_2(var1);
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = var8;
   }

   @Override
   public String toString() {
      return "Sound{name="
         + this.id_class
         + ", volume="
         + this.id_break
         + ", pitch="
         + this.id_byte
         + ", weight="
         + this.id_protected
         + ", type="
         + this.id_throws
         + ", streaming="
         + this.id_case
         + ", preload="
         + this.id_catch
         + ", attenuationDistance="
         + this.id_private
         + "}";
   }

   @Override
   public void id_class(Nt_1 var1) {
      if (this.id_catch) {
         var1.id_class(this);
      }
   }

   @Override
   public int id_class() {
      return this.id_protected;
   }

   public float id_throws() {
      return this.id_break;
   }

   public boolean id_finally() {
      return this.id_catch;
   }

   public Nq_1 id_catch() {
      return this;
   }

   public int id_extends() {
      return this.id_private;
   }

   public float id_case() {
      return this.id_byte;
   }

   public boolean id_implements() {
      return this.id_case;
   }

   public rqO_2 id_protected() {
      return new rqO_2(this.id_class.id_byte(), "sounds/" + this.id_class.id_break() + ".ogg");
   }

   public NT id_private() {
      return this.id_throws;
   }

   public rqO_2 id_native() {
      return this.id_class;
   }
}
