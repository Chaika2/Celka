package celestial;

interface cR_2<T extends rJr_1, U extends vm_3 & cl_3<T>> {
   default void id_class(rgP_2 var1, rJP<T> var2, QY var3, int var4) {
      vm_3 var5 = this.create(
         (T)var2.id_class(var4, (rhz_3)((cb_3)var3.id_class[57]).id_implements[1]), (rhz_3)((cb_3)var3.id_class[57]).id_implements[1], var1
      );
      cb_3 var10000 = (cb_3)var3.id_class[57];
      rJr_1 var10 = ((cl_3)var5).G_();
      var10000.id_implements[4] = var10;
      var3.id_break(var5);
   }

   U create(T var1, rhz_3 var2, rgP_2 var3);
}
