package celestial;

import java.util.Optional;
import java.util.OptionalInt;

public class rYz_1 {
   private OptionalInt id_class = OptionalInt.empty();
   private OptionalInt id_break = OptionalInt.empty();
   private OptionalInt id_byte = OptionalInt.empty();
   private OptionalInt id_protected = OptionalInt.empty();
   private Optional<Integer> id_throws = Optional.empty();
   private Optional<Integer> id_case = Optional.empty();
   private rYQ id_catch = rYQ.NONE;
   private Optional<rYV> id_private = Optional.empty();
   private Optional<rqA_2> id_implements = Optional.empty();
   private Optional<rYj_1> id_finally = Optional.empty();
   private Optional<rYg_1> id_extends = Optional.empty();
   private Optional<NS> id_native = Optional.empty();

   public rYz_1 id_byte(int var1) {
      this.id_byte = OptionalInt.of(var1);
      return this;
   }

   public rYz_1 id_class(rYV var1) {
      this.id_private = Optional.of(var1);
      return this;
   }

   public rYz_1 id_class(rqA_2 var1) {
      this.id_implements = Optional.of(var1);
      return this;
   }

   public rYz_1 id_class(rYj_1 var1) {
      this.id_finally = Optional.of(var1);
      return this;
   }

   public rYz_1 id_class(rYg_1 var1) {
      this.id_extends = Optional.of(var1);
      return this;
   }

   public rYz_1 id_class(NS var1) {
      this.id_native = Optional.of(var1);
      return this;
   }

   public rYW id_class() {
      return new rYW(
         this.id_class.orElseThrow(() -> new IllegalStateException("Missing 'fog' color.")),
         this.id_break.orElseThrow(() -> new IllegalStateException("Missing 'water' color.")),
         this.id_byte.orElseThrow(() -> new IllegalStateException("Missing 'water fog' color.")),
         this.id_protected.orElseThrow(() -> new IllegalStateException("Missing 'sky' color.")),
         this.id_throws,
         this.id_case,
         this.id_catch,
         this.id_private,
         this.id_implements,
         this.id_finally,
         this.id_extends,
         this.id_native
      );
   }

   public rYz_1 id_class(rYQ var1) {
      this.id_catch = var1;
      return this;
   }

   public rYz_1 id_class(int var1) {
      this.id_class = OptionalInt.of(var1);
      return this;
   }

   public rYz_1 id_break(int var1) {
      this.id_break = OptionalInt.of(var1);
      return this;
   }

   public rYz_1 id_throws(int var1) {
      this.id_throws = Optional.of(var1);
      return this;
   }

   public rYz_1 id_case(int var1) {
      this.id_case = Optional.of(var1);
      return this;
   }

   public rYz_1 id_protected(int var1) {
      this.id_protected = OptionalInt.of(var1);
      return this;
   }
}
