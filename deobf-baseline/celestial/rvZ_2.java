package celestial;

import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Set;
import java.util.function.Supplier;

public class rvZ_2 implements ruS_2<At_1> {
   private int id_class;
   private long id_break;
   private boolean id_byte;
   private rRl_1 id_protected;
   private rRl_1 id_throws;
   private Set<rqM_2<rYB>> id_case;
   private rVv_1 id_catch;
   private rRJ id_private;
   private rqM_2<rYB> id_implements;
   private int id_finally;
   private int id_extends;
   private boolean id_native;
   private boolean id_volatile;
   private boolean id_final;
   private boolean id_package;

   public long id_byte() {
      return this.id_break;
   }

   public rvZ_2() {
   }

   public rvZ_2(
      int var1,
      rRl_1 var2,
      rRl_1 var3,
      long var4,
      boolean var6,
      Set<rqM_2<rYB>> var7,
      rVv_1 var8,
      rRJ var9,
      rqM_2<rYB> var10,
      int var11,
      int var12,
      boolean var13,
      boolean var14,
      boolean var15,
      boolean var16
   ) {
      this.id_class = var1;
      this.id_case = var7;
      this.id_catch = var8;
      this.id_private = var9;
      this.id_implements = var10;
      this.id_break = var4;
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_finally = var11;
      this.id_byte = var6;
      this.id_extends = var12;
      this.id_native = var13;
      this.id_volatile = var14;
      this.id_final = var15;
      this.id_package = var16;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readInt();
      this.id_byte = var1.readBoolean();
      this.id_protected = rRl_1.id_class(var1.readByte());
      this.id_throws = rRl_1.id_class(var1.readByte());
      int var2 = var1.id_case();
      this.id_case = Sets.newHashSet();

      for (int var3 = 0; var3 < var2; var3++) {
         this.id_case.add(rqM_2.id_class(rVL.id_static, var1.id_volatile()));
      }

      this.id_catch = var1.id_class(rVv_1.id_class);
      this.id_private = var1.<Supplier<rRJ>>id_class(rRJ.id_final).get();
      this.id_implements = rqM_2.id_class(rVL.id_static, var1.id_volatile());
      this.id_break = var1.readLong();
      this.id_finally = var1.id_case();
      this.id_extends = var1.id_case();
      this.id_native = var1.readBoolean();
      this.id_volatile = var1.readBoolean();
      this.id_final = var1.readBoolean();
      this.id_package = var1.readBoolean();
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeInt(this.id_class);
      var1.writeBoolean(this.id_byte);
      var1.writeByte(this.id_protected.id_class());
      var1.writeByte(this.id_throws.id_class());
      var1.id_protected(this.id_case.size());

      for (rqM_2 var3 : this.id_case) {
         var1.id_class(var3.id_class());
      }

      var1.id_class(rVv_1.id_class, this.id_catch);
      var1.id_class(rRJ.id_final, () -> this.id_private);
      var1.id_class(this.id_implements.id_class());
      var1.writeLong(this.id_break);
      var1.id_protected(this.id_finally);
      var1.id_protected(this.id_extends);
      var1.writeBoolean(this.id_native);
      var1.writeBoolean(this.id_volatile);
      var1.writeBoolean(this.id_final);
      var1.writeBoolean(this.id_package);
   }

   public int id_break() {
      return this.id_class;
   }

   public rRl_1 id_throws() {
      return this.id_protected;
   }

   public rqM_2<rYB> id_finally() {
      return this.id_implements;
   }

   public Set<rqM_2<rYB>> id_catch() {
      return this.id_case;
   }

   public int id_extends() {
      return this.id_extends;
   }

   public rRl_1 id_case() {
      return this.id_throws;
   }

   public rRJ id_implements() {
      return this.id_private;
   }

   public boolean id_package() {
      return this.id_package;
   }

   public boolean id_protected() {
      return this.id_byte;
   }

   public rVm_1 id_private() {
      return this.id_catch;
   }

   public boolean id_final() {
      return this.id_final;
   }

   public boolean id_volatile() {
      return this.id_volatile;
   }

   public boolean id_native() {
      return this.id_native;
   }
}
