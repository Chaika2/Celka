package celestial;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public abstract class rHm_1 implements gV_2 {
   private static final SimpleDateFormat id_class = new SimpleDateFormat("HH:mm:ss");
   private static final rgP_2 id_break = new rgN_2("@");
   private long id_protected = -1L;
   private boolean id_throws = true;
   private int id_case;
   private boolean id_catch = true;
   private rgP_2 id_private;
   private String id_implements = "";
   private rgP_2 id_finally = id_break;

   public abstract rjU_2 id_byte();

   @Override
   public boolean C() {
      return this.id_class().B().id_break(rRu_1.id_final) && this.id_catch;
   }

   @Override
   public boolean l() {
      return this.id_catch;
   }

   @Override
   public void id_class(rgP_2 var1, UUID var2) {
      if (this.id_catch) {
         this.id_private = new rgN_2("[" + id_class.format(new Date()) + "] ").id_class(var1);
         this.id_break();
      }
   }

   public void id_class(rgP_2 var1) {
      if (var1 != null) {
         this.id_finally = var1;
      } else {
         this.id_finally = id_break;
      }
   }

   public abstract rrEm_1 id_class();

   public void id_class(int var1) {
      this.id_case = var1;
   }

   public void id_class(boolean var1) {
      this.id_catch = var1;
   }

   public rcd_3 id_class(rcd_3 var1) {
      var1.id_class("Command", this.id_implements);
      var1.id_break("SuccessCount", this.id_case);
      var1.id_class("CustomName", rgB_2.id_class(this.id_finally));
      var1.id_class("TrackOutput", this.id_catch);
      if (this.id_private != null && this.id_catch) {
         var1.id_class("LastOutput", rgB_2.id_class(this.id_private));
      }

      var1.id_class("UpdateLastExecution", this.id_throws);
      if (this.id_throws && this.id_protected > 0L) {
         var1.id_class("LastExecution", this.id_protected);
      }

      return var1;
   }

   public void id_class(String var1) {
      this.id_implements = var1;
      this.id_case = 0;
   }

   public boolean id_class(rYB var1) {
      if (var1.id_continue || var1.r() == this.id_protected) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.id_implements)) {
         this.id_private = new rgN_2("#itzlipofutzli");
         this.id_case = 1;
         return true;
      } else {
         this.id_case = 0;
         rnW_2 var2 = this.id_class().id_const();
         if (var2.O() && !rql_3.id_break(this.id_implements)) {
            try {
               this.id_private = null;
               gy_3 var3 = this.id_throws().id_class((var1x, var2x, var3x) -> {
                  if (var2x) {
                     this.id_case++;
                  }
               });
               var2.f().id_class(var3, this.id_implements);
            } catch (Throwable var6) {
               KY var4 = KY.id_class(var6, "Executing command block");
               Ko_1 var5 = var4.id_class("Command to be executed");
               var5.id_class("Command", this::id_private);
               var5.id_class("Name", () -> this.id_implements().getString());
               throw new KU(var4);
            }
         }

         if (this.id_throws) {
            this.id_protected = var1.r();
         } else {
            this.id_protected = -1L;
         }

         return true;
      }
   }

   public ryZ_2 id_class(rhd_3 var1) {
      if (!var1.sU()) {
         return ryZ_2.PASS;
      } else {
         if (var1.e().id_continue) {
            var1.id_class(this);
         }

         return ryZ_2.id_class(((rYB)var1.id_throws[7]).id_continue);
      }
   }

   public void id_break(rcd_3 var1) {
      this.id_implements = var1.id_native("Command");
      this.id_case = var1.id_private("SuccessCount");
      if (var1.id_byte("CustomName", 8)) {
         this.id_class(rgB_2.id_class(var1.id_native("CustomName")));
      }

      if (var1.id_byte("TrackOutput", 1)) {
         this.id_catch = var1.id_new("TrackOutput");
      }

      if (var1.id_byte("LastOutput", 8) && this.id_catch) {
         try {
            this.id_private = rgB_2.id_class(var1.id_native("LastOutput"));
         } catch (Throwable var3) {
            this.id_private = new rgN_2(var3.getMessage());
         }
      } else {
         this.id_private = null;
      }

      if (var1.id_throws("UpdateLastExecution")) {
         this.id_throws = var1.id_new("UpdateLastExecution");
      }

      if (this.id_throws && var1.id_throws("LastExecution")) {
         this.id_protected = var1.id_implements("LastExecution");
      } else {
         this.id_protected = -1L;
      }
   }

   public void id_break(rgP_2 var1) {
      this.id_private = var1;
   }

   public abstract void id_break();

   public abstract gy_3 id_throws();

   @Override
   public boolean H() {
      return this.id_class().B().id_break(rRu_1.id_private);
   }

   public boolean id_finally() {
      return this.id_catch;
   }

   public rgP_2 id_catch() {
      return this.id_private == null ? rgN_2.id_byte : this.id_private;
   }

   public int id_case() {
      return this.id_case;
   }

   public rgP_2 id_implements() {
      return this.id_finally;
   }

   public String id_private() {
      return this.id_implements;
   }
}
