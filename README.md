
# SquircleImageView

### Description
This library is regarding SquircleImageView where we can use as Imageview which is perfect for profile images.

## Screenshot
<img src="squircle_imageview.png" height="500em" /> 

### How to use it 
Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

```ruby
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency
```ruby
	dependencies {
	        implementation 'com.github.android-inheritx:SquircleImageView:0.1.2'
	}
 ```
 Notes:
 The ScaleType is always CENTER_CROP and you'll get an exception if you try to change it. This is (currently) by design as it's perfectly fine for profile images.
 
### Usage
```xml
 <com.example.squircleview.SquircleView
     android:id="@+id/sqProfile"
     android:layout_width="200dp"
     android:layout_height="200dp"
     android:layout_centerInParent="true"
     app:civ_border_width="3dp"
     app:civ_border_color="#2585D1" />
```
 
### Formula for creating Squircle shape on canvas
(|x|)^3 + (|y|)^3 = radius^3

### Reference and Credit
[CircleImageView](https://github.com/hdodenhof/CircleImageView) from [hdodenhof](https://github.com/hdodenhof)


## Created By

[Team Android - Inheritx](https://github.com/android-inheritx)
