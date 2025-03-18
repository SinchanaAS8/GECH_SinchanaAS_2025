from django.db import models

# Create your models here.
class Student(models.Model):
    name = models.CharField(blank=False,max_length=100)
    email = models.EmailField(blank=False)
    password = models.CharField(blank=False,max_length=100)
