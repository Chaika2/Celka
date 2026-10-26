package celestial;

import java.util.Optional;
import java.util.OptionalInt;

public class rYz_1 {
   private OptionalInt class_ = OptionalInt.empty();
   private OptionalInt break_ = OptionalInt.empty();
   private OptionalInt byte_ = OptionalInt.empty();
   private OptionalInt protected_ = OptionalInt.empty();
   private Optional<Integer> throws_ = Optional.empty();
   private Optional<Integer> case_ = Optional.empty();
   private rYQ catch_ = rYQ.NONE;
   private Optional<rYV> private_ = Optional.empty();
   private Optional<rqA_2> implements_ = Optional.empty();
   private Optional<rYj_1> finally_ = Optional.empty();
   private Optional<rYg_1> extends_ = Optional.empty();
   private Optional<NS> native_ = Optional.empty();

   public rYz_1 byte_(int var1) {
      this.byte_ = OptionalInt.of(var1);
      return this;
   }

   public rYz_1 class_(rYV var1) {
      this.private_ = Optional.of(var1);
      return this;
   }

   public rYz_1 class_(rqA_2 var1) {
      this.implements_ = Optional.of(var1);
      return this;
   }

   public rYz_1 class_(rYj_1 var1) {
      this.finally_ = Optional.of(var1);
      return this;
   }

   public rYz_1 class_(rYg_1 var1) {
      this.extends_ = Optional.of(var1);
      return this;
   }

   public rYz_1 class_(NS var1) {
      this.native_ = Optional.of(var1);
      return this;
   }

   public rYW class_() {
      return new rYW(
         this.class_.orElseThrow(() -> new IllegalStateException("Missing 'fog' color.")),
         this.break_.orElseThrow(() -> new IllegalStateException("Missing 'water' color.")),
         this.byte_.orElseThrow(() -> new IllegalStateException("Missing 'water fog' color.")),
         this.protected_.orElseThrow(() -> new IllegalStateException("Missing 'sky' color.")),
         this.throws_,
         this.case_,
         this.catch_,
         this.private_,
         this.implements_,
         this.finally_,
         this.extends_,
         this.native_
      );
   }

   public rYz_1 class_(rYQ var1) {
      this.catch_ = var1;
      return this;
   }

   public rYz_1 class_(int var1) {
      this.class_ = OptionalInt.of(var1);
      return this;
   }

   public rYz_1 break_(int var1) {
      this.break_ = OptionalInt.of(var1);
      return this;
   }

   public rYz_1 throws_(int var1) {
      this.throws_ = Optional.of(var1);
      return this;
   }

   public rYz_1 case_(int var1) {
      this.case_ = Optional.of(var1);
      return this;
   }

   public rYz_1 protected_(int var1) {
      this.protected_ = OptionalInt.of(var1);
      return this;
   }
}
