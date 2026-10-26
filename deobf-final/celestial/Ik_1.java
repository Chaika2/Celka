package celestial;

public class Ik_1 {
   public static final Ik_1 class_ = new Ik_1();
   public final IL break_;
   public final IL byte_;
   public final IL protected_;
   public final IL throws_;
   public final IL case_;
   public final IL catch_;
   public final IL private_;
   public final IL implements_;

   public Ik_1(IL var1, IL var2, IL var3, IL var4, IL var5, IL var6, IL var7, IL var8) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
      this.catch_ = var6;
      this.private_ = var7;
      this.implements_ = var8;
   }

   public Ik_1(Ik_1 var1) {
      this.break_ = var1.break_;
      this.byte_ = var1.byte_;
      this.protected_ = var1.protected_;
      this.throws_ = var1.throws_;
      this.case_ = var1.case_;
      this.catch_ = var1.catch_;
      this.private_ = var1.private_;
      this.implements_ = var1.implements_;
   }

   private Ik_1() {
      this(IL.class_, IL.class_, IL.class_, IL.class_, IL.class_, IL.class_, IL.class_, IL.class_);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public IL class_(IQ var1) {
      switch (var1) {
         case THIRD_PERSON_LEFT_HAND:
            return this.break_;
         case THIRD_PERSON_RIGHT_HAND:
            return this.byte_;
         case FIRST_PERSON_LEFT_HAND:
            return this.protected_;
         case FIRST_PERSON_RIGHT_HAND:
            return this.throws_;
         case HEAD:
            return this.case_;
         case GUI:
            return this.catch_;
         case GROUND:
            return this.private_;
         case FIXED:
            return this.implements_;
         default:
            return IL.class_;
      }
   }

   public boolean break_(IQ var1) {
      return this.class_(var1) != IL.class_;
   }
}
