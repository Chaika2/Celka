package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class rrPN {
   private rpa_3 id_class = rpa_3.NONE;
   private rqd_3 id_break = rqd_3.NONE;
   private rfH_2 id_byte = rfH_2.id_protected;
   private boolean id_protected;
   private rfj_3 id_throws;
   private rfi_3 id_case;
   private boolean id_catch = true;
   private Random id_private;
   private int id_implements;
   private final List<rrPA> id_finally = Lists.newArrayList();
   private boolean id_extends;
   private boolean id_native;

   public rpa_3 id_byte() {
      return this.id_class;
   }

   public rrPN id_byte(boolean var1) {
      this.id_native = var1;
      return this;
   }

   public rrPN id_class(Random var1) {
      this.id_private = var1;
      return this;
   }

   public rrPT id_class(List<rrPT> var1, rfH_2 var2) {
      int var3 = var1.size();
      if (var3 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return (rrPT)var1.get(this.id_break(var2).nextInt(var3));
      }
   }

   public rrPN id_class(rrPA var1) {
      this.id_finally.add(var1);
      return this;
   }

   public rrPN id_class(rpa_3 var1) {
      this.id_class = var1;
      return this;
   }

   public rrPN id_class() {
      rrPN var1 = new rrPN();
      var1.id_class = this.id_class;
      var1.id_break = this.id_break;
      var1.id_byte = this.id_byte;
      var1.id_protected = this.id_protected;
      var1.id_throws = this.id_throws;
      var1.id_case = this.id_case;
      var1.id_catch = this.id_catch;
      var1.id_private = this.id_private;
      var1.id_implements = this.id_implements;
      var1.id_finally.addAll(this.id_finally);
      var1.id_extends = this.id_extends;
      var1.id_native = this.id_native;
      return var1;
   }

   public rrPN id_class(rqd_3 var1) {
      this.id_break = var1;
      return this;
   }

   public rrPN id_class(rfH_2 var1) {
      this.id_byte = var1;
      return this;
   }

   public rrPN id_class(boolean var1) {
      this.id_protected = var1;
      return this;
   }

   public rrPN id_class(rfi_3 var1) {
      this.id_case = var1;
      return this;
   }

   public rrPN id_class(rfj_3 var1) {
      this.id_throws = var1;
      return this;
   }

   private rfi_3 id_break(rfj_3 var1) {
      if (var1 == null) {
         return this.id_case;
      } else {
         int var2 = var1.id_break * 16;
         int var3 = var1.id_byte * 16;
         return new rfi_3(var2, 0, var3, var2 + 16 - 1, 255, var3 + 16 - 1);
      }
   }

   public rrPN id_break() {
      this.id_finally.clear();
      return this;
   }

   public Random id_break(rfH_2 var1) {
      if (this.id_private != null) {
         return this.id_private;
      } else {
         return var1 == null ? new Random(rqR_2.id_break()) : new Random(rfU_2.id_class(var1));
      }
   }

   public rrPN id_break(boolean var1) {
      this.id_extends = var1;
      return this;
   }

   public rrPN id_break(rrPA var1) {
      this.id_finally.remove(var1);
      return this;
   }

   public rfH_2 id_throws() {
      return this.id_byte;
   }

   void id_finally() {
      if (this.id_throws != null) {
         this.id_case = this.id_break(this.id_throws);
      }
   }

   public rfi_3 id_catch() {
      if (this.id_case == null && this.id_throws != null) {
         this.id_finally();
      }

      return this.id_case;
   }

   public boolean id_extends() {
      return this.id_catch;
   }

   public boolean id_case() {
      return this.id_protected;
   }

   public List<rrPA> id_implements() {
      return this.id_finally;
   }

   public rqd_3 id_protected() {
      return this.id_break;
   }

   public boolean id_private() {
      return this.id_extends;
   }

   public boolean id_native() {
      return this.id_native;
   }
}
