package celestial;

import java.util.UUID;

public abstract class rRG {
   private final UUID id_class;
   protected rgP_2 id_byte;
   protected float id_protected;
   protected rRb_1 id_throws;
   protected rRM id_case;
   protected boolean id_catch;
   protected boolean id_private;
   protected boolean id_implements;

   public rRG id_byte(boolean var1) {
      this.id_implements = var1;
      return this;
   }

   public rRG(UUID var1, rgP_2 var2, rRb_1 var3, rRM var4) {
      this.id_class = var1;
      this.id_byte = var2;
      this.id_throws = var3;
      this.id_case = var4;
      this.id_protected = 1.0F;
   }

   public void id_class(rRb_1 var1) {
      this.id_throws = var1;
   }

   public void id_class(float var1) {
      this.id_protected = var1;
   }

   public rRG id_class(boolean var1) {
      this.id_catch = var1;
      return this;
   }

   public void id_class(rRM var1) {
      this.id_case = var1;
   }

   public void id_class(rgP_2 var1) {
      this.id_byte = var1;
   }

   public float id_class() {
      return this.id_protected;
   }

   public rRG id_break(boolean var1) {
      this.id_private = var1;
      return this;
   }

   public rRb_1 id_finally() {
      return this.id_throws;
   }

   public rRM id_extends() {
      return this.id_case;
   }

   public rgP_2 id_implements() {
      return this.id_byte;
   }

   public UUID id_private() {
      return this.id_class;
   }

   public boolean id_final() {
      return this.id_implements;
   }

   public boolean id_volatile() {
      return this.id_private;
   }

   public boolean id_native() {
      return this.id_catch;
   }
}
