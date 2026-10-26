package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rDy_1 {
   private final rKi_1 id_class;
   private final rKY id_break;
   private Set<xd_3> id_byte = ImmutableSet.of();
   private Set<xc_3> id_protected = ImmutableSet.of();
   private int id_throws = 64;
   private int id_case = 7;
   private int id_catch = 3;
   private int id_private = 7;
   private boolean id_implements;
   private boolean id_finally = true;
   private boolean id_extends = false;

   public rDy_1 id_byte(int var1) {
      this.id_catch = var1;
      return this;
   }

   public rDy_1 id_byte() {
      this.id_extends = true;
      return this;
   }

   public rDy_1(rKi_1 var1, rKY var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public rDy_1 id_class(Set<xd_3> var1) {
      this.id_byte = var1;
      return this;
   }

   public rDy_1 id_class() {
      this.id_implements = true;
      return this;
   }

   public rDy_1 id_class(int var1) {
      this.id_throws = var1;
      return this;
   }

   public rDy_1 id_break() {
      this.id_finally = false;
      return this;
   }

   public rDy_1 id_break(int var1) {
      this.id_case = var1;
      return this;
   }

   public rDy_1 id_break(Set<xc_3> var1) {
      this.id_protected = var1;
      return this;
   }

   public rDy_1 id_protected(int var1) {
      this.id_private = var1;
      return this;
   }

   public rDH id_protected() {
      return new rDH(
         this.id_class,
         this.id_break,
         this.id_byte,
         this.id_protected,
         this.id_throws,
         this.id_case,
         this.id_catch,
         this.id_private,
         this.id_implements,
         this.id_finally,
         this.id_extends
      );
   }
}
