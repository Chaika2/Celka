package celestial;

public class Ik_1 {
   public static final Ik_1 id_class = new Ik_1();
   public final IL id_break;
   public final IL id_byte;
   public final IL id_protected;
   public final IL id_throws;
   public final IL id_case;
   public final IL id_catch;
   public final IL id_private;
   public final IL id_implements;

   public Ik_1(IL var1, IL var2, IL var3, IL var4, IL var5, IL var6, IL var7, IL var8) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
      this.id_catch = var6;
      this.id_private = var7;
      this.id_implements = var8;
   }

   public Ik_1(Ik_1 var1) {
      this.id_break = var1.id_break;
      this.id_byte = var1.id_byte;
      this.id_protected = var1.id_protected;
      this.id_throws = var1.id_throws;
      this.id_case = var1.id_case;
      this.id_catch = var1.id_catch;
      this.id_private = var1.id_private;
      this.id_implements = var1.id_implements;
   }

   private Ik_1() {
      this(IL.id_class, IL.id_class, IL.id_class, IL.id_class, IL.id_class, IL.id_class, IL.id_class, IL.id_class);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public IL id_class(IQ var1) {
      switch (var1) {
         case THIRD_PERSON_LEFT_HAND:
            return this.id_break;
         case THIRD_PERSON_RIGHT_HAND:
            return this.id_byte;
         case FIRST_PERSON_LEFT_HAND:
            return this.id_protected;
         case FIRST_PERSON_RIGHT_HAND:
            return this.id_throws;
         case HEAD:
            return this.id_case;
         case GUI:
            return this.id_catch;
         case GROUND:
            return this.id_private;
         case FIXED:
            return this.id_implements;
         default:
            return IL.id_class;
      }
   }

   public boolean id_break(IQ var1) {
      return this.id_class(var1) != IL.id_class;
   }
}
