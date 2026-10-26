package celestial;

import com.google.common.collect.ComparisonChain;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rLY implements Comparable<rLY> {
   private static final Logger id_class = LogManager.getLogger();
   private final rLR id_break;
   private int id_byte;
   private int id_protected;
   private boolean id_throws;
   private boolean id_case;
   private boolean id_catch;
   private boolean id_private;
   private boolean id_implements;
   private String id_finally;
   private rLY id_extends;

   public int id_byte(rLY var1) {
      return this.id_break() > 32147 && var1.id_break() > 32147 || this.id_protected() && var1.id_protected()
         ? ComparisonChain.start().compare(this.id_protected(), var1.id_protected()).compare(this.id_class().id_case(), var1.id_class().id_case()).result()
         : ComparisonChain.start()
            .compare(this.id_protected(), var1.id_protected())
            .compare(this.id_break(), var1.id_break())
            .compare(this.id_class().id_case(), var1.id_class().id_case())
            .result();
   }

   private void id_byte(rcd_3 var1) {
      var1.id_class("Amplifier", (byte)this.id_byte());
      var1.id_break("Duration", this.id_break());
      var1.id_class("Ambient", this.id_protected());
      var1.id_class("ShowParticles", this.id_throws());
      var1.id_class("ShowIcon", this.id_case());
      if (this.id_extends != null) {
         rcd_3 var2 = new rcd_3();
         this.id_extends.id_class(var2);
         var1.id_class("HiddenEffect", var2);
      }
   }

   public int id_byte() {
      return this.id_protected;
   }

   public rLY(rLR var1, int var2, int var3, boolean var4, boolean var5, boolean var6, rLY var7) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_case = var4;
      this.id_private = var5;
      this.id_implements = var6;
      this.id_extends = var7;
      this.id_finally = var1.id_protected().id_byte();
   }

   public rLY(rLY var1) {
      this.id_break = var1.id_break;
      this.id_class(var1);
   }

   public rLY(rLR var1) {
      this(var1, 0, 0);
   }

   public rLY(rLR var1, int var2) {
      this(var1, var2, 0);
   }

   public rLY(rLR var1, int var2, int var3) {
      this(var1, var2, var3, false, true);
   }

   public rLY(rLR var1, int var2, int var3, boolean var4, boolean var5) {
      this(var1, var2, var3, var4, var5, var5);
   }

   public rLY(rLR var1, int var2, int var3, boolean var4, boolean var5, boolean var6) {
      this(var1, var2, var3, var4, var5, var6, (rLY)null);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rLY var2)
            ? false
            : this.id_byte == var2.id_byte
               && this.id_protected == var2.id_protected
               && this.id_throws == var2.id_throws
               && this.id_case == var2.id_case
               && this.id_break.equals(var2.id_break);
      }
   }

   @Override
   public String toString() {
      String var1;
      if (this.id_protected > 0) {
         var1 = this.id_private() + " x " + (this.id_protected + 1) + ", Duration: " + this.id_byte;
      } else {
         var1 = this.id_private() + ", Duration: " + this.id_byte;
      }

      if (this.id_throws) {
         var1 = var1 + ", Splash: true";
      }

      if (!this.id_private) {
         var1 = var1 + ", Particles: false";
      }

      if (!this.id_implements) {
         var1 = var1 + ", Show Icon: false";
      }

      return var1;
   }

   @Override
   public int hashCode() {
      int var1 = this.id_break.hashCode();
      var1 = 31 * var1 + this.id_byte;
      var1 = 31 * var1 + this.id_protected;
      var1 = 31 * var1 + (this.id_throws ? 1 : 0);
      return 31 * var1 + (this.id_case ? 1 : 0);
   }

   public rcd_3 id_class(rcd_3 var1) {
      var1.id_class("Id", (byte)rLR.id_class(this.id_class()));
      this.id_byte(var1);
      return var1;
   }

   public rLR id_class() {
      return this.id_break;
   }

   public void id_class(iB_2 var1) {
      if (this.id_byte > 0) {
         this.id_break.id_class(var1, this.id_protected);
      }
   }

   void id_class(rLY var1) {
      this.id_byte = var1.id_byte;
      this.id_protected = var1.id_protected;
      this.id_case = var1.id_case;
      this.id_private = var1.id_private;
      this.id_implements = var1.id_implements;
   }

   private static rLY id_class(rLR var0, rcd_3 var1) {
      byte var2 = var1.id_case("Amplifier");
      int var3 = var1.id_private("Duration");
      boolean var4 = var1.id_new("Ambient");
      boolean var5 = true;
      if (var1.id_byte("ShowParticles", 1)) {
         var5 = var1.id_new("ShowParticles");
      }

      boolean var6 = var5;
      if (var1.id_byte("ShowIcon", 1)) {
         var6 = var1.id_new("ShowIcon");
      }

      rLY var7 = null;
      if (var1.id_byte("HiddenEffect", 10)) {
         var7 = id_class(var0, var1.id_int("HiddenEffect"));
      }

      return new rLY(var0, var3, var2 < 0 ? 0 : var2, var4, var5, var6, var7);
   }

   public boolean id_class(iB_2 var1, Runnable var2) {
      if (this.id_byte > 0) {
         if (this.id_break.id_class(this.id_byte, this.id_protected)) {
            this.id_class(var1);
         }

         this.id_catch();
         if (this.id_byte == 0 && this.id_extends != null) {
            this.id_class(this.id_extends);
            this.id_extends = this.id_extends.id_extends;
            var2.run();
         }
      }

      return this.id_byte > 0;
   }

   public void id_class(boolean var1) {
      this.id_catch = var1;
   }

   public boolean id_break(rLY var1) {
      if (this.id_break != var1.id_break) {
         id_class.warn("This method should only be called for matching effects!");
      }

      boolean var2 = false;
      if (var1.id_protected > this.id_protected) {
         if (var1.id_byte < this.id_byte) {
            rLY var3 = this.id_extends;
            this.id_extends = new rLY(this);
            this.id_extends.id_extends = var3;
         }

         this.id_protected = var1.id_protected;
         this.id_byte = var1.id_byte;
         var2 = true;
      } else if (var1.id_byte > this.id_byte) {
         if (var1.id_protected == this.id_protected) {
            this.id_byte = var1.id_byte;
            var2 = true;
         } else if (this.id_extends == null) {
            this.id_extends = new rLY(var1);
         } else {
            this.id_extends.id_break(var1);
         }
      }

      if (!var1.id_case && this.id_case || var2) {
         this.id_case = var1.id_case;
         var2 = true;
      }

      if (var1.id_private != this.id_private) {
         this.id_private = var1.id_private;
         var2 = true;
      }

      if (var1.id_implements != this.id_implements) {
         this.id_implements = var1.id_implements;
         var2 = true;
      }

      return var2;
   }

   public static rLY id_break(rcd_3 var0) {
      byte var1 = var0.id_case("Id");
      rLR var2 = rLR.id_class(var1);
      return var2 == null ? null : id_class(var2, var0);
   }

   public int id_break() {
      return this.id_byte;
   }

   public boolean id_throws() {
      return this.id_private;
   }

   public boolean id_finally() {
      return this.id_throws;
   }

   public int id_catch() {
      if (this.id_extends != null) {
         this.id_extends.id_catch();
      }

      return --this.id_byte;
   }

   public boolean id_extends() {
      return this.id_catch;
   }

   public boolean id_case() {
      return this.id_implements;
   }

   public boolean id_implements() {
      return this.id_catch;
   }

   public boolean id_protected() {
      return this.id_case;
   }

   public String id_private() {
      return this.id_break.id_byte();
   }

   public String id_final() {
      return this.id_finally;
   }

   public rLY id_volatile() {
      return this.id_extends;
   }

   public boolean id_native() {
      return this.id_private;
   }
}
