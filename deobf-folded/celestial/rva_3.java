package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class rva_3 implements ruS_2<At_1> {
   private rvi_3 id_class;
   private List<rqO_2> id_break;
   private List<rqO_2> id_byte;
   private rka_3 id_protected;

   public List<rqO_2> id_byte() {
      return this.id_byte;
   }

   public rva_3(rvi_3 var1, Collection<rqO_2> var2, Collection<rqO_2> var3, rka_3 var4) {
      this.id_class = var1;
      this.id_break = ImmutableList.copyOf(var2);
      this.id_byte = ImmutableList.copyOf(var3);
      this.id_protected = var4;
   }

   public rva_3() {
   }

   @Override
   public String toString() {
      return "SRecipeBookPacket(state="
         + this.id_throws()
         + ", recipes="
         + this.id_break()
         + ", displayedRecipes="
         + this.id_byte()
         + ", field_244301_d="
         + this.id_protected
         + ")";
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_class(rvi_3.class);
      this.id_protected = rka_3.id_class(var1);
      int var2 = var1.id_case();
      this.id_break = Lists.newArrayList();

      for (int var3 = 0; var3 < var2; var3++) {
         this.id_break.add(var1.id_volatile());
      }

      if (this.id_class == rvi_3.INIT) {
         var2 = var1.id_case();
         this.id_byte = Lists.newArrayList();

         for (int var5 = 0; var5 < var2; var5++) {
            this.id_byte.add(var1.id_volatile());
         }
      }
   }

   public List<rqO_2> id_break() {
      return this.id_break;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      this.id_protected.id_break(var1);
      var1.id_protected(this.id_break.size());

      for (rqO_2 var3 : this.id_break) {
         var1.id_class(var3);
      }

      if (this.id_class == rvi_3.INIT) {
         var1.id_protected(this.id_byte.size());

         for (rqO_2 var5 : this.id_byte) {
            var1.id_class(var5);
         }
      }
   }

   public rvi_3 id_throws() {
      return this.id_class;
   }

   public rka_3 id_protected() {
      return this.id_protected;
   }
}
