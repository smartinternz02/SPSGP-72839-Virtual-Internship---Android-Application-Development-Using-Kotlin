package com.example.groceryapplication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020\u001eH\u0016J\u0006\u0010)\u001a\u00020$R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006*"}, d2 = {"Lcom/example/groceryapplication/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/groceryapplication/GroceryRVAdapter$GroceryItemClickInterface;", "()V", "addFAB", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "getAddFAB", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "setAddFAB", "(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V", "groceryRVAdapter", "Lcom/example/groceryapplication/GroceryRVAdapter;", "getGroceryRVAdapter", "()Lcom/example/groceryapplication/GroceryRVAdapter;", "setGroceryRVAdapter", "(Lcom/example/groceryapplication/GroceryRVAdapter;)V", "groceryViewModal", "Lcom/example/groceryapplication/GroceryViewModal;", "getGroceryViewModal", "()Lcom/example/groceryapplication/GroceryViewModal;", "setGroceryViewModal", "(Lcom/example/groceryapplication/GroceryViewModal;)V", "itemsRV", "Landroidx/recyclerview/widget/RecyclerView;", "getItemsRV", "()Landroidx/recyclerview/widget/RecyclerView;", "setItemsRV", "(Landroidx/recyclerview/widget/RecyclerView;)V", "list", "", "Lcom/example/groceryapplication/GroceryItems;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "groceryItems", "openDialog", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.groceryapplication.GroceryRVAdapter.GroceryItemClickInterface {
    public androidx.recyclerview.widget.RecyclerView itemsRV;
    public com.google.android.material.floatingactionbutton.FloatingActionButton addFAB;
    public java.util.List<com.example.groceryapplication.GroceryItems> list;
    public com.example.groceryapplication.GroceryRVAdapter groceryRVAdapter;
    public com.example.groceryapplication.GroceryViewModal groceryViewModal;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getItemsRV() {
        return null;
    }
    
    public final void setItemsRV(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.floatingactionbutton.FloatingActionButton getAddFAB() {
        return null;
    }
    
    public final void setAddFAB(@org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.FloatingActionButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.groceryapplication.GroceryItems> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.groceryapplication.GroceryItems> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.groceryapplication.GroceryRVAdapter getGroceryRVAdapter() {
        return null;
    }
    
    public final void setGroceryRVAdapter(@org.jetbrains.annotations.NotNull()
    com.example.groceryapplication.GroceryRVAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.groceryapplication.GroceryViewModal getGroceryViewModal() {
        return null;
    }
    
    public final void setGroceryViewModal(@org.jetbrains.annotations.NotNull()
    com.example.groceryapplication.GroceryViewModal p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void openDialog() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.example.groceryapplication.GroceryItems groceryItems) {
    }
}